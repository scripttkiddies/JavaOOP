public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukan Nama Lengkap : ");
	String nama = masukan.nextLine();
        
        String[] NamaTengah = nama.split(" ");
        
        System.out.println ("Nama Belakang Anda Adalah : " + NamaTengah[NamaTengah.length-1]);
        
   } 
