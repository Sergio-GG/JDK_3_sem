public class Pair<K,V>{

    K valK;
    V valV;

    Pair(K k, V v){
        this.valK = k;
        this.valV = v;
    }

    public K getFirst(){
        return valK;
    }
    public V getSecond(){
        return valV;
    }

    @Override
    public String toString() {
        return "Pair{" +
                valK +
                ", " + valV +
                '}';
    }
}
