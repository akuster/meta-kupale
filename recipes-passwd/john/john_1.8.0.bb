DESCRIPTION = "John the Ripper password cracker"
SUMMARY = "John the Ripper is a fast password cracker, currently available for many flavors of Unix, Windows, DOS, BeOS, and OpenVMS. Its primary purpose is to detect weak Unix passwords. Besides several crypt(3) password hash types most commonly found on various Unix systems, supported out of the box are Windows LM hashes, plus lots of other hashes and ciphers in the community-enhanced version. "
HOMEPAGE = "http://www.openwall.com/john/"

LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://doc/LICENSE;md5=123ff47bb528caa97868cdfc262bd96a"

DEPENDS = "pwgen-native"

SRC_URI = "http://www.openwall.com/${PN}/j/${PN}-${PV}.tar.xz"

SRC_URI[md5sum] = "a4086df68f51778782777e60407f1869"
SRC_URI[sha256sum] = "952cf68369fb5b27f2d112ce7ca1eb16b975c85cbce8c658abb8bc5a20e1b266"

inherit autotools-brokensep

do_compile () {
    cd ${S}/src
    sed -i 's/LDFLAGS = -s \$(OMPFLAGS)/LDFLAGS = \$(OMPFLAGS)/' Makefile
    make CC="${CC} -g -DJOHN_SYSTEMWIDE=1" generic
}

do_install () {
    install -d ${D}/${sbindir}
    install -d ${D}/${datadir}/john

    install -m 644 run/ascii.chr ${D}/${datadir}/john
    install -m 644 run/digits.chr ${D}/${datadir}/john
    install -m 644 run/lm_ascii.chr ${D}/${datadir}/john
    install -m 644 run/password.lst ${D}/${datadir}/john
    install -m 644 run/john.conf ${D}/${sysconfdir}

    install -m 755 run/john ${D}/${sbindir}
    install -m 755 run/mailer ${D}/${sbindir}
    install -m 755 run/makechr ${D}/${sbindir}
    install -m 755 run/relbench ${D}/${sbindir}

    cd ${D}/${sbindir}
    ln -s john unafs
    ln -s john unique 
    ln -s john unshadow 
}


RDEPENDS_${PN} = "perl"
