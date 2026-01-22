# =====================
# Java tools
# =====================
JAVAC = javac
JAVA  = java
JAVADOC = javadoc

# =====================
# Project structure
# =====================
CLASSPATH = main/java
BIN  = bin
DOCS  = ../docs
MAIN  = com.ft.pckg.simulator.Simulator
SCENARIO = test/resources/scenario.txt

# =====================
# Find all source files
# =====================
SOURCES := $(shell find $(CLASSPATH) -name "*.java")

# =====================
# Default target
# =====================
all: compile run

# =====================
# Compile sources
# =====================
compile:
	mkdir -p $(BIN)
	$(JAVAC) -d $(BIN) -sourcepath $(CLASSPATH) $(SOURCES)

# =====================
# Run simulator
# =====================
run: compile
	$(JAVA) -cp $(BIN) $(MAIN) $(SCENARIO)

# =====================
# Docs constructor
# =====================
docs:
	mkdir -p $(DOCS)
	$(JAVADOC) -d $(DOCS) -sourcepath main/java $(SOURCES)


# =====================
# Clean build artifacts
# =====================
clean:
	rm -rf $(BIN) $(DOCS)

.PHONY: all compile run docs clean
