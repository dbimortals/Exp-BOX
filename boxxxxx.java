class box2
  {
	  double w,h,d;
   box2()
  {
	  w=10;
	  h=20;
	  d=30; 
   }   
	  double vol()
      {
	      return w*h*d;
	  }	  
  }
  class boxxxxx
  {
         public static void main(String[] args)
		 {
              box2 a=new box2();
			 double vol=a.vol();
			  System.out.println("Volume of box1 is:"  +vol);
		 }
  }