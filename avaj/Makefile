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
#SCENARIO = test/resources/ko/scenario.txt
SCENARIO := $(word 2, $(MAKECMDGOALS))

# =====================
# Find all source files
# =====================
SOURCES := $(shell find $(CLASSPATH) -name "*.java")

# =====================
# Default target
# =====================
all: compile

# =====================
# Compile sources
# =====================
compile:
	mkdir -p $(BIN)
	$(JAVAC) -d $(BIN) -sourcepath $(CLASSPATH) $(SOURCES)

# =====================
# Run simulator
# =====================
run: 
#	$(JAVA) -cp $(BIN) $(MAIN) $(SCENARIO)
ifndef SCENARIO
	$(error Use: make run ok/scenario.txt)
endif
	@if [ ! -d "$(BIN)" ] || [ -z "$$(ls $(BIN) 2>/dev/null)" ]; then \
		echo "Erro: bin/ required. Run 'make compile' first."; \
		exit 1; \
	fi
	$(JAVA) -cp $(BIN) $(MAIN) test/resources/$(SCENARIO)

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
	rm -rf $(BIN)

# =====================
# Clean docs files
# =====================
cdoc:
	rm -rf $(DOCS)


%:
	@:

.PHONY: all compile run docs clean cdoc
