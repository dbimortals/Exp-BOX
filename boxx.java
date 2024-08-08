class box2
  {
      double width;
	  double height;
	  double depth; 
      double vol()
      {
	      return   width*height*depth;
	  }	  
  }
  class boxx
  {
         public static void main(String[] args)
		 {
		      box b1=new box();
			  box b2=new box();
			  b1.width   = 10;
			  b1.height  = 20;
			  b1.depth   = 30;
			  double v  =  b1.vol();
			  System.out.println("Volume of box1 is:"  +v);
		 }
  }