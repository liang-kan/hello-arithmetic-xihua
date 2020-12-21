package java8;

import java.sql.SQLOutput;

/**
 * @author: TapFun
 * @since: 2020/12/21/16:38
 **/

public interface Animal {
    void cry();

    public static void main(String[] args) {

        Animal dog = new Animal(){
            @Override
            public void cry() {
                System.out.println("狗：往往女王你噶");
            }
        };
        dog.cry();


       Animal cat =()->System.out.println("🐱：秒买哦爱买奥");
       cat.cry();


       Animal catAnddog = ()->{
               dog.cry();
               cat.cry();
       };

       catAnddog.cry();
    }
}
