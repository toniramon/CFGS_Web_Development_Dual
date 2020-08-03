package org.lasencinas.bowlinGame;

import java.util.*;

public class Toni {

    private String nom;
    private int edat;
    private Double altura;
    private String descripcio;


    public Toni(String nom, int edat, Double altura, String descripcio) {
        this.nom = nom;
        this.edat = edat;
        this.altura = altura;
        this.descripcio = descripcio;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public Double getAltura() {
        return altura;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public HashMap<Integer, String> tornarHasMap() {
        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(1,"Salsa Barbacoa");
        System.out.println(mapa);
        return mapa;
    }


    public ArrayList<Integer> tornarArrayList() {
        ArrayList<Integer> mapa = new ArrayList<Integer>();
        mapa.add(1);
        System.out.println(mapa);
        return mapa;
    }


    public TreeMap<Integer, String> tornarTreeMap() {
        TreeMap<Integer, String> mapa = new TreeMap();
        mapa.put(1, "Barbacue");
        System.out.println(mapa);
        return mapa;
    }


    public LinkedHashMap<Integer, String> tornarLinkedHashMap() {
        LinkedHashMap<Integer, String> mapa = new LinkedHashMap<Integer, String>();
        mapa.put(1, "Tomeeeeu");
        System.out.println(mapa);
        return mapa;
    }


    public HashSet<String> tornarHashSet() {
        HashSet<String> mapa = new HashSet<String>();
        mapa.add("Bibilo");
        System.out.println(mapa);
        return mapa;
    }


    public TreeSet<Integer> tornarTreeSet() {
        TreeSet<Integer> mapa = new TreeSet<Integer>();
        mapa.add(25);
        System.out.println(mapa);
        return mapa;
    }

    public LinkedHashSet<Integer> tornarLinkedHashSet() {
        LinkedHashSet<Integer> mapa = new LinkedHashSet<Integer>();
        mapa.add(50);
        System.out.println(mapa);
        return mapa;
    }




}
