package br.dio.javaPuro;

import br.dio.javaPuro.Singleton.SingletonEager;
import br.dio.javaPuro.Singleton.SingletonLazy;
import br.dio.javaPuro.Singleton.SingletonLazyHolder;
import br.dio.javaPuro.Strategy.*;

public class Teste {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

       SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        Comportamento Defensivo = new ComportamentoDefensivo();
        Comportamento Normal = new ComportamentoNormal();
        Comportamento Agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(Normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(Defensivo);
        robo.mover();
        robo.setComportamento(Agressivo);
        robo.mover();
    }
}
