public class Bank {
    int saldo;
    int simpan;
    int ambil;
    public Bank ( int saldoAwal){
        saldo = saldoAwal;
        System.out.println("Selamat Data di Bank ABCD ") ;
        
    }
    //simpanUang, ambilUang, dan getSaldo
    public void simpanUang(int simpanan){
       simpan= simpanan;
       System.out.println("Simpan Uang Rp. "+ simpan) ;
       System.out.println("Saldo saat ini Rp. :" + getSaldo(simpan));
    }
    
   public void ambilUang(int ambilan){
       ambil= ambilan;
       System.out.println ("Ambil uang Rp."+ambil);
       System.out.println("Saldo saat ini Rp. :" + getSaldo(-ambil));

   }
   
   public int getSaldo( int nilai){
     
       if(saldo+nilai>=0){
           saldo = saldo + nilai;
         }else{
           System.out.println("Saldo anda tidak cukup...");
         }
       return saldo;
   }
    
}
