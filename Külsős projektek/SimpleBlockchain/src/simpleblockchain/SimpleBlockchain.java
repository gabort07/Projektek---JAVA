package simpleblockchain;

import java.util.ArrayList;
import java.util.Arrays;


public class SimpleBlockchain {

   
    ArrayList<Block> blockchain = new ArrayList<>();   
    
    public static void main(String[] args) {
      
        String [] genesisTransaction = {"satoshi sent ivan 10 bitcoin","hal finnez sent 10 bitcoin to ivan"};
        Block genesisBlock = new Block(0, genesisTransaction);
        
        String[] block2Transaction = {"ivan sent 10 bitcoin to satoshi", "satoshi sent 10 bitcoin to starbucks"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transaction);
        
        String[] block3Transaction = {"ivan sent 999 bitcoin to satoshi"};
        Block block3 = new Block(genesisBlock.getBlockHash(), block3Transaction);
        
        System.out.print("Hash of genesis block: ");
        System.out.println(genesisBlock.getBlockHash());
        
        System.out.print("Hash of block 2: ");
        System.out.println(block2.getBlockHash());
        
        System.out.print("Hash of block 3: ");
        System.out.println(block3.getBlockHash());
    }

}
