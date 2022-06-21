package by.tms.studio;

public enum Size {
   XXS(32), XS(34), S(36), M(38), L(40);

   Size(int euroSize) {
   }

   public String getDescription(Size size) {
      if (size == Size.XXS) {
         return "Baby size";
      }
      return "Adult size";
   }
}
