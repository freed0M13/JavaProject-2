public class LCGRandom {
    private long seed;
    private final long a = 1664525L;      // çarpan (multiplier)
    private final long c = 1013904223L;   // artım (increment)
    private final long m = (long) Math.pow(2, 32);  // modül (modulus)

    /* Sistem zamanını kullanarak LCG seedi oluşturma */
    public LCGRandom() {
        this.seed = System.currentTimeMillis() % m;
        // Seed'in 0 olmamasını garantile
        if (this.seed == 0) {
            this.seed = 1;
        }
    }

    /* Belirlenmiş seed ile yeni nesne oluşturuluyor */
    public LCGRandom(long seed) {
        this.seed = seed % m;
        // Seed'in 0 olmamasını garantile
        if (this.seed == 0) {
            this.seed = 1;
        }
    }

    /* LCG formülünü kullanarak rastgele sayıyı oluşturur */
    private long nextRaw() {
        seed = (a * seed + c) % m;
        return seed;
    }

    /* Belirtilen aralıkta rastgele oluşturulan sayıyı tam sayı olarak döndürür */
    public int nextInt(int min, int max) {
        // Parametrelerin doğruluğunu kontrol et
        if (min > max) {
            throw new IllegalArgumentException("Min değer max değerden büyük olamaz");
        }

        long raw = nextRaw();
        return min + (int)(Math.abs(raw) % (max - min + 1));
    }
}