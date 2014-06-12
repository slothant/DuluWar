package server.entities;

import server.abstractEntities.Entity;
import server.abstractEntities.Soldier;
import server.abstractEntities.Wall;
import server.main.EntitiesContainer;

public class SlowWall extends Wall {

   //���� ������ ��� ��ƼƼ �����̳�
   EntitiesContainer enemyContainer;
   // �������� ����
   double range = 5;

   public SlowWall(int X, int line) {      
      super(X, line);
      HP = 7;
      price = 1000;
   }

   public void perform() {
      // ������ �������� �ȿ� ������  ���ο� ���ӽð� ����
      for (Soldier soldier : enemyContainer.getSoldier(line))
         if (Math.abs(X - soldier.X) < range)
            soldier.slowCount +=5;
   }

}