DESCRIPTION = "A small image with Security packages"

IMAGE_FEATURES += "ssh-server-openssh"

KAPULE_IMAGE_TYPE = "Kapule"

IMAGE_INSTALL = "\
    packagegroup-base \
    packagegroup-core-x11 \
    packagegroup-xfce-base \
    packagegroup-kupale-base \
    os-release \
    "

REQUIRED_DISTRO_FEATURES = "x11"

IMAGE_LINGUAS ?= " "

LICENSE = "MIT"

export IMAGE_BASENAME = "core-image-kapule"

inherit core-image
