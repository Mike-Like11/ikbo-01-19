package pract_10;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    FunctionalChair createFunctionalChair();
    MagicChair createMagichair();
}
