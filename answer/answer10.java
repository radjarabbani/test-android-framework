sysdate = 2024-10-08

coniditon:
(tgl_expired < sysdate) = true
(tgl_akhir < sysdate) = true
(flag5=P) = false
(ket8 is not null) = true
(ket10 in (2, W) = true
(flag_member=S) = false
(relasi is null and min_rp is null) = true
(relasi is null and flag_relasi=T) = false
(flag7=’T’) = false
(No struk 1 or No struk 2 is not null) = false
(flag8=’T’) = false
(ket13 is not null) = false

dapat dilihat bahwa disini menggunakan fungsi or '||'
dimana jika terdapat yang true itu berarti "true" walaupun ada yang false
maka invoice status "inactive"
