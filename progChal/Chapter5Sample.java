package progChal;

public class Chapter5Sample {
    
}

abstract class Mushroom{
    String name;
}

interface isPoisonous{
    boolean isEdible =false;
}
interface isContaigous{
    boolean contaigous =true;
}

class BlackShroom extends Mushroom implements isContaigous,isPoisonous{

}

