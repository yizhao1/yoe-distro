# Yoe starter image

DESCRIPTION = "Yoe Starter Image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit core-image
require updater.inc

IMAGE_FEATURES += "ssh-server-dropbear package-management hwcodecs"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    os-release \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"
IMAGE_INSTALL_append_arm = " 96boards-tools"
IMAGE_INSTALL_append_aarch64 = " 96boards-tools"

export IMAGE_BASENAME = "yoe-simple-image"

BAD_RECOMMENDATIONS += "eudev-hwdb udev-hwdb libmodule-build-perl"
