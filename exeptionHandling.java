public class exeptionHandling {
    public static void main(String[] args) {
        try {
            int hasil = 10 / 0; 
            System.out.println(hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Blok finally selalu dijalankan.");
        }

        
        try {
            bacaFile("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }

        
        try {
            cekUmur(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Validasi gagal: " + e.getMessage());
        }
    }

    
    static void bacaFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

    static void cekUmur(int umur) {
        if (umur < 18) {
            throw new IllegalArgumentException("Umur harus >= 18");
        }
    }
}

        
    

