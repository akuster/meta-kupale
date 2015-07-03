require core-image-kupale.bb

DESCRIPTION = "A Kupale image that contains all packages"

KAPULE_IMAGE_TYPE = "Kapule-full"

IMAGE_INSTALL += "\
    packagegroup-kupale-base \
    packagegroup-kupale-passwd \
    packagegroup-kupale-testing \
    packagegroup-kupale-forensic \
    packagegroup-kupale-wireless \
    "
