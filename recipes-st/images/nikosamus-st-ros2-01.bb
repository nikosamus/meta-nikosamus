# Use weston image as a base
require recipes-st/images/st-image-weston.bb
#require recipes-ros/images/ros2-image
# Image description
DESCRIPTION = "Example image with VIM text editor"

# Additional software to be included in image
IMAGE_INSTALL += "vim"