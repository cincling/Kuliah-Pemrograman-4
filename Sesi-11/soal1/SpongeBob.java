class SpongeBob extends Hewan implements Manusia {
	public SpongeBob() {
		super("sponge bob", 2, false);
	}

	public void bersuara() {
		System.out.println("\nhallo patrick...");
	}

	public void menyanyi() {
		System.out.println("nye, nye, nye, wik, wik, wik");
	}

	public void ketawa() {
		System.out.println("kek, kek, kek");
	}

	public static void makan() {
		System.out.println("uenak tenan...");
	}

	public void makan2() {
		super.makan();
	}

	public static void main(String[] args) {
		SpongeBob s = new SpongeBob();
		s.isHewan();
		s.bersuara();
		s.menyanyi();
		s.ketawa();
		s.makan2();
		Hewan.makan();
		makan();
	}
}