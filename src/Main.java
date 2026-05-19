public class Main {

    public static void main(String[] args) {

        System.out.println("Mining Block 1...");
        Block block1 = new Block("Transaction Data 1", "0");
        block1.mineBlock(Blockchain.difficulty);
        Blockchain.blockchain.add(block1);

        System.out.println("Mining Block 2...");
        Block block2 = new Block("Transaction Data 2", block1.hash);
        block2.mineBlock(Blockchain.difficulty);
        Blockchain.blockchain.add(block2);

        System.out.println("Mining Block 3...");
        Block block3 = new Block("Transaction Data 3", block2.hash);
        block3.mineBlock(Blockchain.difficulty);
        Blockchain.blockchain.add(block3);

        System.out.println("\nBlockchain Valid: " + Blockchain.isChainValid());

        System.out.println("\nBlockchain Contents:\n");

        for (Block block : Blockchain.blockchain) {
            System.out.println("---------------------------------");
            System.out.println("Data: " + block.data);
            System.out.println("Hash: " + block.hash);
            System.out.println("Previous Hash: " + block.previousHash);
            System.out.println("---------------------------------");
        }
    }
}
