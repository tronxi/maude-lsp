parser grammar MaudeParser;

options { tokenVocab=MaudeLexer; }

term: LP term RP |
  termPlus;

termPlus: TOKEN termPlus |
  TOKEN;