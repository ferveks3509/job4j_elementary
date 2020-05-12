package ru.job4j.oop.story.storyBall;

public class BallHistory {
    public static void main(String[] args) {
        Ball colobok = new Ball();
        Wolf wolk = new Wolf();
        Fox lisa = new Fox();
        Hare poleno = new Hare();

        wolk.tryEat(colobok);
        lisa.tryEat(colobok);
        poleno.tryEat(colobok);
        colobok.tryLive();
    }
}
