public class BankBeraksi {
    public static void main (String[] args){
        Bank objBank = new Bank(100000);
        System.out.println("Menu ATM");
        System.out.println("[1] Cek Saldo   [2] Simpan Uang    [3] Ambil Uang ");
        
        Scanner inputan = new Scanner (System.in);  
        System.out.print("Pilih Menu : ");
        int pilih = inputan.nextInt();    
        if (pilih == 1){
            System.out.println("Saldo Anda Saat Ini Rp. : " + objBank.saldo);          
        }else if (pilih == 2){
            System.out.print("Masukan Uang Yang Akan Disimpan : ");
            int masuk = inputan.nextInt();
            objBank.simpanUang(masuk); 
        }else if (pilih == 3){
            System.out.print("Masukan Uang Yang Akan Diambil : ");
            int ambil = inputan.nextInt(); 
            objBank.ambilUang(ambil);
        }else{
            System.out.print("Silahkan Masukan Pilihan Yang Benar!!!");
            
        }        
    } 
    
}
