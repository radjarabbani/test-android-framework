
sysdate = 2021-07-19
tgl_expired = 2021-07-22
tgl_akhir = 2021-07-31

 //data mapping.invoice status
tgl_expired < sysdate --> false
tgl_akhir < sysdate --> false

//data mapping.end date
if tgl_expired < tgl_akhir
        tgl_expired - 1
 --> 2021-07-22 < 2021-07-31
        2021-07-22 - 1
=           2021-07-21

