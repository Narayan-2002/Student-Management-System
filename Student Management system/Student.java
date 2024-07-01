import java.util.Scanner;
public class Student {
   String UidPass[][]=new String[100][2];
   String Details[][]=new String[100][8];
   int i=0; int j=0;int k=0;
   public void LogIn() {
	   double rowcount=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("\n\n\t\t\tLogIn / SignUP");
	   System.out.println("\t\t     ====================\n\n");
	   System.out.print("Enter Your Uid:-");
	   String uid=sc.next();
	   System.out.print("Enter Your Password:-");
	   String pass=sc.next();
	   for(int i=0;i<this.UidPass.length;i++) {
		   for(int j=0;j<2;j++) {
			   if(this.UidPass[i][j]!=null) {
				   rowcount+=0.5;
			   }
		   }
	   }
	   for(int n=0;n<(int)rowcount;n++) {
			   if(uid.equals(this.UidPass[n][0]) && pass.equals(this.UidPass[n][1])) {
				   System.out.println("\n\n\t\t     ****LogIn Successfull****\n\n");
				   SubOption(n);
				   sc.close();
				   return;
			   }
	   }
		   System.out.println("\n\n\t\t**********   LogIn Failed   **********\n\n");
		   sc.close();
		   return;
   }
   public void SubOption(int num) {
	   Scanner sc=new Scanner(System.in);
	   do {
		   this.displayOption2();
		   System.out.print("Enter Your Choice:-");
		   int ch=sc.nextInt();
		   switch(ch) {
		   case 1:
       		this.ShowProfile(num);
       		break;
       	   case 2:
       		this.EditProfile(num);
       		break;
       	   case 3:
			sc.close();
       		return;
		   }
	   }while(true);
   }
   public void Register() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("\n\n\t\t\tRegister / SignIn");
	   System.out.println("\t\t      =====================\n\n");
	   System.out.print("Enter User id:- ");
	   this.UidPass[this.i][this.j++]=sc.next();
	   System.out.print("Enter password:-");
	   this.UidPass[this.i][this.j]=sc.next();
	   this.j=0;
	   System.out.println("\n\n\t\t     ****Register Successfull****\n\n");
	   System.out.println("\t\t     ****Create Profile****\n\n");
	   System.out.print("NAME:-             ");
	   this.Details[this.i][this.k++]=sc.next();
	   System.out.print("FATHER'S NAME:-    ");
	   this.Details[this.i][this.k++]=sc.next();
	   System.out.print("D-O-B(DD/MM/YY):-  ");
	   this.Details[this.i][this.k++]=sc.next();
	   System.out.print("MOBILE NO:-        ");
	   this.Details[this.i][this.k++]=sc.next();
	   System.out.print("EMAIL:-            ");
	   this.Details[this.i][this.k++]=sc.next();
	   System.out.print("BLOOD GROUP:-      ");
	   this.Details[this.i][this.k++]=sc.next();
	   System.out.print("CATAGORY:-         ");
	   this.Details[this.i][this.k++]=sc.next();
	   System.out.print("GENDER:-           ");
	   this.Details[this.i][this.k]=sc.next();
	   this.i++;
	   this.k=0;
	   System.out.println("\n\n\t\t     ****Profile Created Successfull****\n\n");
	   sc.close();
   }
   public void ShowProfile(int i){
	           int k=0;
	           System.out.println("\n\n\t\t     ****Welcome to "+this.Details[i][k]+" Profile****\n\n");
	           System.out.println("NAME:-             "+this.Details[i][k++]);
			   System.out.println("FATHER'S NAME:-    "+this.Details[i][k++]);
			   System.out.println("D-O-B(DD/MM/YY):-  "+this.Details[i][k++]);
			   System.out.println("MOBILE NO:-        "+this.Details[i][k++]);
			   System.out.println("EMAIL:-            "+this.Details[i][k++]);
			   System.out.println("BLOOD GROUP:-      "+this.Details[i][k++]);
			   System.out.println("CATAGORY:-         "+this.Details[i][k++]);
			   System.out.println("GENDER:-           "+this.Details[i][k++]);
			   System.out.println("\n\n\t\t     ****"+this.Details[i][0]+" Profile Loaded Successfull****\n\n");
			   return;		   
   }
   public void EditProfile(int i) {
	   System.out.println("\n\n\t\t     ****you can now edit your details****\n\n");
	   Scanner sc=new Scanner(System.in);
       do {
    	   System.out.println("select any option to edit the detail:-");
    	   System.out.println("1. Edit Name");
    	   System.out.println("2. Edit Fathers Name");
    	   System.out.println("3. Edit DOB");
    	   System.out.println("4. Edit MobileNo");
    	   System.out.println("5. Edit Email");
    	   System.out.println("6. Edit Blood Group");
    	   System.out.println("7. Edit Catagory");
    	   System.out.println("8. Edit Gender");
    	   System.out.println("9. Previous Page");
    	   System.out.print("Enter your Choice:-");
    	   int choice=sc.nextInt();
      	switch(choice) {
      	case 1:
      		System.out.print("NAME:-             ");
      		this.Details[i][0]=sc.next();
      		break;
      	case 2:
      		System.out.print("FATHER'S NAME:-    ");
      		this.Details[i][1]=sc.next();
      		break;
      	case 3:
      		System.out.print("D-O-B(DD/MM/YY):-  ");
      		this.Details[i][2]=sc.next();
      		break;
      	case 4:
      		System.out.print("MOBILE NO:-        ");
      		this.Details[i][3]=sc.next();
      		break;
      	case 5:
      		System.out.print("EMAIL:-            ");
      		this.Details[i][4]=sc.next();
      		break;
      	case 6:
      		System.out.print("BLOOD GROUP:-      ");
      		this.Details[i][5]=sc.next();
      		break;
      	case 7:
      		System.out.print("CATAGORY:-         ");
      		this.Details[i][6]=sc.next();
      		break;
      	case 8:
      	    System.out.print("GENDER:-           ");
      		this.Details[i][7]=sc.next();
      		break;
      	case 9:
		    sc.close();
      		return;
      	}
       }while(true);
	   
   }
   public void displayOption1() {
	   System.out.println("1. Login / Signup");
	   System.out.println("2. New Register / SignIn");
	   System.out.println("3. exit");
   }
   public void displayOption2() {
	   System.out.println("1. Show Profile");
	   System.out.println("2. EditProfile");
	   System.out.println("3. Exit");
   }
	public static void main(String[] args) {
         Student s=new Student();
         Scanner sc=new Scanner(System.in);
         System.out.println("\n\t\tWelCome To Student Management System");
         System.out.println("\t      =========================================\n\n");
         s.displayOption1();
         System.out.print("enter your choice:-");
         int choice=sc.nextInt();
         do {
        	switch(choice) {
        	case 1:
			    sc.close();
        		s.LogIn();
        		break;
        	case 2:
			    sc.close();
        		s.Register();
        		break;
        	case 3:
			    sc.close();
        		System.exit(0);
        	}
        	System.out.println("\n\n\t*****************Welcome Back To Home Page*******************\n"
        			+"\t=============================================================\n");
        	 s.displayOption1();
        	 System.out.print("enter your choice:-");
             choice=sc.nextInt();
         }while(true);
	}

}
