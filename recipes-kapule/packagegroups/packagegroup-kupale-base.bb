DESCRIPTION = "Security packagegroup for Poky"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

RDEPENDS_${PN} = "\
    apache2 \
    atftpd \
    expect \
    florence \
    git \
    gparted \
    iw \
    lvm2 \
    netcat \
    openssh-sshd \
    openvpn \
    p7zip \
    parted \
    php \
    rfkill \
    samba \
    screen \
    net-snmp-server-snmpd \
    net-snmp \
    subversion \
    sudo \
    tcpdump \
    netkit-tftp \
    tmux \
    vim \
"

RDEPENDS_packagegroup-kapule-need-add = " \
    axel \
    desktop-base \
    mercurial \
    mysql-server \
    php-mysql \
    rcconf \
    rdesktop \
    sysv-rc-conf \
    testdisk \
    tightvncserver \
    unrar \
    upx-ucl \
"
