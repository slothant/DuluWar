package server.entities;

import server.abstractEntities.Wall;

public class NomalWall extends Wall {
   
   public NomalWall(int X, int line) {
      super(X, line);
      HP = 7;
      price = 1000;
   }

   public void perform() {
   }

}