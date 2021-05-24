VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "REGISTRO ENTRADA Y SALIDA"
   ClientHeight    =   2730
   ClientLeft      =   120
   ClientTop       =   465
   ClientWidth     =   4140
   LinkTopic       =   "Form1"
   Picture         =   "APP INGRESO Y SALIDA.frx":0000
   ScaleHeight     =   2730
   ScaleWidth      =   4140
   StartUpPosition =   3  'Windows Default
   Begin VB.Timer Timer1 
      Interval        =   1000
      Left            =   3600
      Top             =   2160
   End
   Begin VB.CommandButton Command2 
      Caption         =   "SALIDA"
      BeginProperty Font 
         Name            =   "Times New Roman"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   2040
      TabIndex        =   6
      Top             =   2040
      Width           =   1455
   End
   Begin VB.CommandButton Command1 
      Caption         =   "ENTRADA"
      BeginProperty Font 
         Name            =   "Times New Roman"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   360
      TabIndex        =   5
      Top             =   2040
      Width           =   1335
   End
   Begin VB.TextBox Text2 
      Height          =   405
      Left            =   1080
      TabIndex        =   4
      Top             =   1440
      Width           =   2655
   End
   Begin VB.TextBox Text1 
      Height          =   405
      Left            =   1080
      TabIndex        =   2
      Top             =   960
      Width           =   2655
   End
   Begin VB.Label Label3 
      Caption         =   "   AREA"
      BeginProperty Font 
         Name            =   "Times New Roman"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   120
      TabIndex        =   3
      Top             =   1440
      Width           =   855
   End
   Begin VB.Label Label2 
      Caption         =   "NOMBRE"
      BeginProperty Font 
         Name            =   "Times New Roman"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   120
      TabIndex        =   1
      Top             =   960
      Width           =   855
   End
   Begin VB.Label Label1 
      BackColor       =   &H00FF80FF&
      Caption         =   "BIENVENIDO, INGRESE SU NOMBRE Y AREA"
      BeginProperty Font 
         Name            =   "Times New Roman"
         Size            =   14.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   360
      TabIndex        =   0
      Top             =   120
      Width           =   3375
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Dim NOMBRE As String
Dim AREA As String
Dim hora As String
Dim fecha As String
Dim ruta As String


NOMBRE = Text1.Text
AREA = Text2.Text
hora = Format(Time, "hh:mm:ss")
fecha = Format(Date, "dd/mm/yyyy")
ruta = "C:\Users\adria\Downloads\INGRESO Y SALIDA DE EMPLEADOS\entradas.dat"

If Dir(ruta) = "" Then
Open ruta For Output As #1
Print #1, NOMBRE & vbCrLf & "Area asignada: " & AREA & vbCrLf & "Hora de ingreso: " & hora & vbCrLf & "Fecha de ingreso: " & fecha & vbCrLf & vbCrLf
Close #1
Else
Open ruta For Append As #1
Print #1, NOMBRE & vbCrLf & "Area asignada: " & AREA & vbCrLf & "Hora de ingreso: " & hora & vbCrLf & "Fecha de ingreso: " & fecha & vbCrLf & vbCrLf
Close #1
End If



End Sub

Private Sub Command2_Click()
Dim NOMBRE As String
Dim AREA As String
Dim hora As String
Dim fecha As String
Dim ruta As String


NOMBRE = Text1.Text
AREA = Text2.Text
hora = Format(Time, "hh:mm:ss")
fecha = Format(Date, "dd/mm/yyyy")
ruta = "C:\Users\adria\Downloads\INGRESO Y SALIDA DE EMPLEADOS\salidas.dat"

If Dir(ruta) = "" Then
Open ruta For Output As #1
Print #1, NOMBRE & vbCrLf & "Area asignada: " & AREA & vbCrLf & "Hora de salida: " & hora & vbCrLf & "Fecha de salida: " & fecha & vbCrLf & vbCrLf
Close #1
Else
Open ruta For Append As #1
Print #1, NOMBRE & vbCrLf & "Area asignada: " & AREA & vbCrLf & "Hora de salida: " & hora & vbCrLf & "Fecha de salida: " & fecha & vbCrLf & vbCrLf
Close #1
End If

End Sub
