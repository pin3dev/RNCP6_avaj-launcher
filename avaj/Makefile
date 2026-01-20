# =====================
# Java tools
# =====================
JAVAC = javac
JAVA  = java

# =====================
# Project structure
# =====================
SRC_ROOT = main/java
PKG_ROOT = com/ft/pckg
BIN_DIR  = bin

# =====================
# Find all source files
# =====================
SOURCES := $(shell find $(SRC_ROOT) -name "*.java")

# =====================
# Default target
# =====================
all: compile

# =====================
# Compile sources
# =====================
compile:
	@mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) -sourcepath $(SRC_ROOT) $(SOURCES)

# =====================
# Run simulator
# =====================
run: compile
	$(JAVA) -cp $(BIN_DIR) com.ft.pckg.simulator.Simulator test/resources/scenario.txt

# =====================
# Clean build artifacts
# =====================
clean:
	rm -rf $(BIN_DIR)

.PHONY: all compile run clean
