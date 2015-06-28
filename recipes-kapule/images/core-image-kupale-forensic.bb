require core-image-kupale.bb

DESCRIPTION = "A Kapule image with Forensic packages"

KAPULE_IMAGE_TYPE = "Kapule-forensic"

IMAGE_INSTALL += "\
    packagegroup-kupale-forensic \
    "
