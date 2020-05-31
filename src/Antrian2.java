
/**
 *
 * @author sindi
 */
public class Antrian2 {

 static int ekor = -1;
 static int maxEkor = 5;
 public static void addQueue(String antrian[], String data)
 { if (ekor >= maxEkor)//menggunakan perulangan if jika ekor>=maxEkor
   System.out.println("Maaf, antrian penuh");//menampilkan kata "maaf antrian penuh"
  else
  { //System.out.println("add Queue: "+data);
   ekor++;
   antrian[ekor]=data;
  }
 }
 public static String deQueue(String antrian[])
 { String hasil="";
  if (ekor<0)//menggunakan perulangan if jika ekor<0
   hasil="Maaf, antrian kosong";
  else
  { hasil = antrian[0];
   antrian[0]=null;
   for (int i=1;i<=ekor;i++)//menggunakan perilangan int i=1;i<=ekor;i++
   {
    antrian[i-1]=antrian[i];
    antrian[i]=null;
   }
   ekor--;
  }
  return (hasil);//dimana input mengeluarkan hasilnya
 }
 public static void bacaAntrian(String antrian[])
 { System.out.println("Kondisi Antrian : ");
  for (int i=0;i<=maxEkor;i++)
  {
   if (i==ekor)
    System.out.println(i+". "+ antrian[i]+" ekor");//menampilkan kata i+"."+antrian[i]+"ekor"
   else if (antrian[i]==null)
    System.out.println(i+". ");//menampilkan kata i+"."
   else
    System.out.println(i+". "+antrian[i]);//menampilkan katai+"."+antrian[i]
  }
 }
 public static void main(String []wawan)
 { String antrian[]=new String [16];
 //program tersebut menggunakan prinsip antrian, yaitu siapa yang masuk duluan maka dialah yang akan keluar duluan.
     System.out.println("Sindi fariha");
  addQueue (antrian, "Mobil A");
  addQueue (antrian, "Mobil B");
  addQueue (antrian, "Mobil C");
  addQueue (antrian, "Mobil D");
  addQueue (antrian, "Mobil E");
  addQueue (antrian, "Mobil F");
//jadi pada program yg saya buat di atas ada 6 antrian yaitu mobil A,B,C,D,E dan F.
//maka yang akan keluar pertama adalah yang mengantri pertama. 
     System.out.println("\n");//menggunakan kalimat "\n"
  System.out.println(" ");//menggunakan kalimat" "
  bacaAntrian(antrian);
System.out.println("\n\nURUTAN KELUAR\nQueue : "+deQueue (antrian));//mengguunakan kalimat"\n\nurutan keluar\nQueue
  System.out.println("Queue : "+deQueue (antrian));//menggunakan kalimat"("Queue : "+deQueue (antrian)
  System.out.println("Queue : "+deQueue (antrian));//menggunakan kalimat"("Queue : "+deQueue (antrian)
  System.out.println("Queue : "+deQueue (antrian));//menggunakan kalimat"("Queue : "+deQueue (antrian)
  System.out.println("Queue : "+deQueue (antrian));//menggunakan kalimat"("Queue : "+deQueue (antrian)
System.out.println ("\n\nSedangkan Mobil F masih mengantri");//menggunakan kalimat"\n\nsedangkan mobil f masih mengantri
 }
}

