class box
  {
      double width;
	  double height;
	  double depth; 
      void SetDim(double h,double d,double w)
	  {
		  height=h ;depth=d;width=w;
	  }
	  double vol()
      {
	      return   width*height*depth;
	  }	  
  }
  class boxxx
  {
         public static void main(String[] args)
		 {
		      box b1=new box();
			  b1.SetDim(20,30,40);
			  box b2=new box();
			  b2.SetDim(10,20,30);
			  double v  =  b1.vol();
			  System.out.println("Volume of box1 is:"  +v);
			  v  =  b2.vol();
			  System.out.println("Volume of box2 is:" +v);
		 }
  }