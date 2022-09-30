package com.example.demo;

public class Db {
  
  private Vendor[] vendors;

  public  Db() {
    this.vendors = new Vendor[4];
    vendors[0] =  new Vendor(1, "ICBP PT. Indofood CBP Sukses Makmur Tbk.", "PT. Indofood CBP Sukses Makmur Tbk (ICBP) bergerak dalam bidang pembuatan mie dan bahan makanan, produk makanan kuliner, biskuit, makanan ringan, nutrisi dan makanan khusus, kemasan, perdagangan, transportasi, pergudangan dan cold storage, jasa manajemen dan penelitian dan pengembangan.", "Sudirman Plaza, Indofood Tower, 25th Floor Jl. Jend. Sudirman Kav. 76-78 South Jakarta DKI Jakarta 12910 ", "(021) 57958822", "http://www.indofoodcbp.com");
    vendors[1] =  new Vendor(2, "MYOR PT. Mayora Indah Tbk", "PT. Mayora Indah Tbk (MYOR) bergerak dalam bidang pembuatan makanan, permen dan biskuit. Perusahaan menjual produknya baik di pasar domestik maupun luar negeri. Perusahaan mulai beroperasi secara komersial pada bulan Mei 1978.", "ALAMAT Gedung Mayora, 8th Floor Jl. Tomang Raya No. 21-23 West Jakarta DKI Jakarta 11440 ", "(021) 5655320", "http://www.mayoraindah.co.id");
    vendors[2] = new Vendor(3, "CMRY PT. Cisarua Mountain Dairy Tbk", "PT. Cisarua Mountain Dairy Tbk (CMRY) didirikan pada tahun 2004. Perusahaan merupakan produsen produk susu premium dan makanan konsumen premium dengan berbagai merek yaitu \"Cimory\", \"Besto\", \"Kanzler\", \"Juragan\", \"Euro Gourmet\", dan \"Mamayo\". Per Juni 2021, Perusahaan memiliki 1.046 karyawan.", "ALAMAT Jl. Sentul No. 101, Kampung Babakan Rawahaur Bogor, West Java 16810 ", "(021) 5874630", "https://www.cimory.com");
    vendors[3] =  new Vendor(4, "PT Unilever Indonesia Tbk", "PT. Unilever Indonesia Tbk (UNVR) bergerak dalam bidang manufaktur, pemasaran dan distribusi barang konsumsi termasuk sabun, deterjen, margarin, makanan berbasis susu, es krim, produk kosmetik, minuman berbasis teh dan jus buah. Portofolio perusahaan mencakup banyak merek yang dicintai dan terkenal di dunia, seperti Pepsodent, Pond's, Lux, Lifebuoy, Dove, Sunsilk, Clear, Rexona, Vaseline, Rinso, Molto, Sunlight, Wall's, Blue Band, Royco, Bango dan masih banyak lagi. Perusahaan mulai beroperasi secara komersial pada tahun 1933.", "ALAMAT Jl. BSD Boulevard Barat Green Office Park Kav. 3 BSD City Tangerang Banten 15345 ", "(021)  80827000", "https://www.unilever.co.id");
    
  }

  public Vendor[] listVendors() {
    return this.vendors;
  }

  public Vendor getVendor(int id) {
    for (Vendor vendor : this.vendors) {
      if (vendor.id == id) {
        return vendor;
      }
    }

    return null;
  }
}
