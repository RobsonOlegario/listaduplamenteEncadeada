package NoDuplo;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhalistaenacadeada = new ListaDuplamenteEncadeada<String>();

        minhalistaenacadeada.add("c1");
        minhalistaenacadeada.add("c2");
        minhalistaenacadeada.add("c3");
        minhalistaenacadeada.add("c4");
        minhalistaenacadeada.add("c5");
        minhalistaenacadeada.add("c6");
        minhalistaenacadeada.add("c7");

        System.out.println(minhalistaenacadeada);

        minhalistaenacadeada.remove(3);
        minhalistaenacadeada.add(3,"10 do Ronaldinho");

        System.out.println(minhalistaenacadeada);
        System.out.println(minhalistaenacadeada.get(3));

    }
}
