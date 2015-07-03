DESCRIPTION = "Kupale default set"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

PROVIDES = "${PACKAGES}"

PACKAGES = "\
    ${PN} \
    packagegroup-kupale-forensics-tools \
    "

RDEPENDS_${PN} = "\
    afflib \
    chkrootkit \
    gdb \
    libewf \
    lvm2 \
    memdump \
    nasm \
    p7zip \
    sleuthkit \
    tcpdump \
    tcpflow \
    tcpreplay \
    wireshark \
    packagegroup-kupale-forensics-tools \
    " 
RDEPENDS_packagegroup-kupale-forensics-tools = "\
    ddrescue \
    volatility \
"
