require core-image-kupale.bb

DESCRIPTION = "A Kupale image th testing packages"

KAPULE_IMAGE_TYPE = "Kapule-testing"

IMAGE_INSTALL += "\
    packagegroup-kupale-testing \
    "
