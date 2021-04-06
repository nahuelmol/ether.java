/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject.ethereum;


import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.EthBlockNumber;

import java.lang.*;
import java.util.concurrent.ExecutionException;

public class MainClass {
    public static void main(String[] args)throws ExecutionException, InterruptedException {
        Web3j web3 = Web3j.build(new HttpService("https://mainnet.infura.io/v3/008192f0ecd445f2bd16825205da6f89"));
        EthBlockNumber result = web3.ethBlockNumber().sendAsync().get();
        System.out.println("The block number is: "+ result.getBlockNumber().toString());
                
    }
}
