public class Buku {

        //attribut dan variable dengan access modifier private
        private String isbn;
        private String judulBuku;
        private String pengarang;
        private String tahunTerbit;
        private String harga;
        private float rating;

        //konstruktor 6 parameter
        public Buku(String isbn, String judulBuku, String pengarang, String tahunTerbit, String harga, float rating){
        this.isbn = isbn;
        this. judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
        }

        //method yang dibuat (isbn)
        public void setIsbn(String isbn){
            this.isbn = isbn;
        }
        public String getIsbn(){
            return isbn;
        }

        //method (judulbuku)
        public void setJudulBuku(String judulBuku){
            this.judulBuku = judulBuku;
        }

        public String getJudulBuku(){
            return judulBuku;
        }

        //method (pengarang)
        public void setPengarang(String pengarang){
            this.pengarang = pengarang;
        }

        public String getPengarang(){
            return pengarang;
        }

        //method (tahun terbit)
        public void setTahunTerbit(String tahunTerbit){
            this.tahunTerbit = tahunTerbit;
        }

        public String getTahunTerbit(){
            return tahunTerbit;
        }

        //method (harga)
        public void setHarga(String harga){
            this.harga = harga;
        }

        public String getHarga(){
            return harga;
        }

        //method (rating)
        public void setRating(float rating){
            this.rating = rating;
        }

        public float getRating(){
            return rating;
        }

    @Override
    public String toString(){
        return "ISBN : " + isbn + " " + "Judul : " + judulBuku + " " + "Pengarang : " + pengarang + " "
        + "Tahun Terbit : " + tahunTerbit + " " + "Harga : " + harga + " " + "Rating : " + rating;
        }
}