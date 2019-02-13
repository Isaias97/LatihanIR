/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class Term {
    private String tern;
    private PostingList list;

    public Term(String tern, PostingList list) {
        this.tern = tern;
        this.list = list;
    }
}
