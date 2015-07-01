DESCRIPTION = "John the Ripper password cracker"
SUMMARY = "John the Ripper is a fast password cracker, currently available for many flavors of Unix, Windows, DOS, BeOS, and OpenVMS. Its primary purpose is to detect weak Unix passwords. Besides several crypt(3) password hash types most commonly found on various Unix systems, supported out of the box are Windows LM hashes, plus lots of other hashes and ciphers in the community-enhanced version. "
HOMEPAGE = "http://www.openwall.com/john/"

LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://doc/LICENSE;md5=123ff47bb528caa97868cdfc262bd96a"

SRC_URI = "http://www.openwall.com/${PN}/j/${PN}-${PV}.tar.xz"

SRC_URI[md5sum] = "a4086df68f51778782777e60407f1869"
SRC_URI[sha256sum] = "952cf68369fb5b27f2d112ce7ca1eb16b975c85cbce8c658abb8bc5a20e1b266"

do_compile () {
    cd ${S}/src
    make CC="${CC}"
}
