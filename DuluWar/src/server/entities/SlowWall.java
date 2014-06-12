package server.entities;

import server.abstractEntities.Entity;
import server.abstractEntities.Soldier;
import server.abstractEntities.Wall;
import server.main.EntitiesContainer;

public class SlowWall extends Wall {

   //적군 정보가 담긴 엔티티 컨테이너
   EntitiesContainer enemyContainer;
   // 느려지는 범위
   double range = 5;

   public SlowWall(int X, int line) {      
      super(X, line);
      HP = 7;
      price = 1000;
   }

   public void perform() {
      // 적군이 일정범위 안에 들어오면  슬로우 지속시간 증가
      for (Soldier soldier : enemyContainer.getSoldier(line))
         if (Math.abs(X - soldier.X) < range)
            soldier.slowCount +=5;
   }

}