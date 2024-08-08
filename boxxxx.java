class box2
  {
      
	  double width;
	  double height;
	  double depth; 
      void vol()
      {
		  double g=width*height*depth;
			  System.out.println("Volume of box1 is:"  +g);
	  }	  
  }
  class boxxxx
  {
         public static void main(String[] args)
		 {
		      box2 b1=new box2();
			  box2 b2=new box2();
			  b1.width   = 10;
			  b1.height  = 20;
			  b1.depth   = 30;
			 b1.vol();
			 
		 }
  }