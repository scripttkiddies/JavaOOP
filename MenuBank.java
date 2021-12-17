public class Bank {
    int saldo;
    int simpan;
    int ambil;
    
    public Bank ( int saldoAwal){
        saldo = saldoAwal;       
    }
    public void simpanUang(int simpanan){
       simpan = simpanan;
       if (simpanan >= 100000){
           saldo = (simpanan + saldo) + simpanan * 10/100 ;
           System.out.println("Anda Mendapat Bonus Bunga 10% Karena Menyimpan > Rp.100000");
       }else saldo = simpanan + saldo;
       System.out.println("Saldo Anda Saat Ini Adalah Rp." +saldo);
    }
   public void ambilUang(int ambilan){
       ambil = ambilan;
       System.out.println ("Jumlah Uang Yang Diambil Rp."+ambil);
       System.out.println("Saldo Anda Saat Ini Rp. :" + getSaldo(-ambil));
   }
   
   public int getSaldo( int nilai){
     
       if(saldo+nilai>=0){
           saldo = saldo + nilai;
         }else{
           System.out.println("Saldo Anda Tidak Cukup...");
         }
       return saldo;
   }
    
}
