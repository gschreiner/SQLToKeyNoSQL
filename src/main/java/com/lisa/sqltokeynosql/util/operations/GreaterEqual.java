/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lisa.sqltokeynosql.util.operations;

/**
 *
 * @author geomar
 */
public class GreaterEqual extends Operator{

    @Override
    public boolean compare(Object a, Object b) {
        return (Double.valueOf(a.toString()))>=(Double.valueOf(b.toString()));
    }
    
}
