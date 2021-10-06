import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Buku> arrayBuku = new ArrayList();

        int a = 0;
        while(a!=6){
            System.out.println("1. Menginput Data Buku");
            System.out.println("2. Mengubah Data Buku");
            System.out.println("3. List Buku");
            System.out.println("4. Cari Buku");
            System.out.println("5. Delete Data Buku");
            System.out.println("6. End\n");
            System.out.println("Pilih Fungsi :");

            a = input.nextInt();

            switch (a){
                case 1 :
                    System.out.println("Menginput Buku");
                    System.out.println("Input no ISBN :");
                    String isbn = input.next();
                    System.out.println("Input Judul Buku :");
                    String judulBuku = input.next();
                    System.out.println("Input Nama Pengarang :");
                    String pengarang = input.next();
                    System.out.println("Input Tahun Terbit :");
                    String tahunTerbit = input.next();
                    System.out.println("Input Harga :");
                    String harga = input.next();
                    System.out.println("Input Rating :");
                    float rating = input.nextFloat();

                    Buku hasil = new Buku(isbn, judulBuku, pengarang, tahunTerbit, harga, rating);
                    arrayBuku.add(hasil);
                    System.out.println("Data buku berhasil ditambahkan");
                    break;

                case 2 :
                    System.out.println("Mengubah Data Buku");
                    System.out.println("Input no ISBN : ");
                    String cari = input.next();
                    for (Buku newDataBuku : arrayBuku){
                        if (newDataBuku.getIsbn().equals(cari)){
                            System.out.println("Input no ISBN : " + newDataBuku.getIsbn());
                            System.out.println("Input Judul Buku Baru :");
                            String newJudulBuku = input.next();
                            newDataBuku.setJudulBuku(newJudulBuku);

                            System.out.println("Input Nama Pengarang :");
                            String newPengarang = input.next();
                            newDataBuku.setPengarang(newPengarang);

                            System.out.println("Input Tahun Terbit :");
                            String newTahunTerbit = input.next();
                            newDataBuku.setTahunTerbit(newTahunTerbit);

                            System.out.println("Input Harga :");
                            String newHarga = input.next();
                            newDataBuku.setHarga(newHarga);

                            System.out.println("Input Rating");
                            float newRating = input.nextFloat();
                            newDataBuku.setRating(newRating);

                            System.out.println("Data berhasil diubah");

                        } else {
                            System.out.println("Data tidak ditemukan");
                        }
                    }
                    break;

                case 3 :
                    System.out.println("List Buku");
                    for (int i = 0; i < arrayBuku.size(); i++) {
                        System.out.println(arrayBuku.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Cari Buku");
                    System.out.println("Masukkan no ISBN : ");
                    String search = input.next();

                    for(Buku dataBuku : arrayBuku){
                        if (dataBuku.getIsbn().equals(search)){
                            System.out.println(dataBuku);
                        }
                    }
                    break;

                case 5 :
                    System.out.println("Hapus Buku");
                    String isbnBuku = input.next();
                    for (int i = 0; i < arrayBuku.size(); i++) {
                        if (isbnBuku.equals(arrayBuku.get(i).getIsbn())){
                            arrayBuku.remove(arrayBuku.get(i));
                            System.out.println("Buku telah dihapus");
                        } else {
                            System.out.println("Buku tidak ditemukan");
                        }
                    }
                    break;
                case 6 :
                    System.out.println("selesai");
                    break;

            }
        }
    }
}