require core-image-kupale.bb

DESCRIPTION = "A Kupale image the testing packages"

KAPULE_IMAGE_TYPE = "Kapule-testing"

IMAGE_INSTALL += "\
    packagegroup-kupale-testing \
    "
