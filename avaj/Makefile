# =====================
# Java tools
# =====================
JAVAC = javac
JAVA  = java
JAVADOC = javadoc

# =====================
# Project structure
# =====================
SRC_ROOT = main/java
BIN_DIR  = bin
DOCS_DIR  = ../docs
MAIN  = com.ft.pckg.simulator.Simulator
SCENE = test/resources/scenario.txt

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
	mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) -sourcepath $(SRC_ROOT) $(SOURCES)

# =====================
# Run simulator
# =====================
run: compile
	$(JAVA) -cp $(BIN_DIR) $(MAIN) $(SCENE)

# =====================
# Docs constructor
# =====================
docs:
	mkdir -p $(DOCS_DIR)
	$(JAVADOC) -d $(DOCS_DIR) -sourcepath main/java $(SOURCES)


# =====================
# Clean build artifacts
# =====================
clean:
	rm -rf $(BIN_DIR) $(DOCS_DIR)

.PHONY: all compile run docs clean
