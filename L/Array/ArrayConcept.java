package ClassLearningExamples.L.Arrays.Array;

public class ArrayConcept {

//    int a =10;
//    int a =20;
//    int a= 30;
//    int a= 40;
//    int a= 50;

    public static void main(String[] args) {

//Declare an Array

//        int a[] = new int[20];
//
//        a[0] =10;
//        a[1] =20;
//        a[2] =30;
//        a[3] =40;
//        a[4] =50;

//        System.out.println(a[0]); //Specific Array
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);

//        System.out.println(a[0] +" "+ a[1]+" "+a[2]+" "+a[3]+" "+a[4]); //Printing Multiple array
//        System.out.println(a.length);//Checking length of array

//  String Array

//        String name[] =new String[5];
//        name[0] = "Nidhi";
//        name[1] = "Hemant";
//        name[2] = "Jigar";
//        name[3] = "Seema";
//        name[4] = "Nimesh";

//        System.out.println(name[0] +" "+ name[1]+" "+name[2]+" "+name[3]+" "+name[4]);

//        for (int i=0; i<=name.length;i++){
//            System.out.println(name[i]);
//        }

// Object Array
        Object StudD[] = new Object[10];
        StudD[0] =1;
        StudD[1] ="Tester Test";
        StudD[2] ="M";
        StudD[3] =69.5f;
        StudD[4] =true;

        for (int j=0;j<= StudD.length;j++)
        {
            System.out.println(StudD[j]);
        }
    }
}
