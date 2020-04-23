PGDMP                         x            Conjunto    12.2    12.2 !    +           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ,           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            -           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            .           1262    32872    Conjunto    DATABASE     �   CREATE DATABASE "Conjunto" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Spain.1252' LC_CTYPE = 'Spanish_Spain.1252';
    DROP DATABASE "Conjunto";
                postgres    false                        3079    32873 	   adminpack 	   EXTENSION     A   CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;
    DROP EXTENSION adminpack;
                   false            /           0    0    EXTENSION adminpack    COMMENT     M   COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';
                        false    1            �            1259    32882    cuentas    TABLE     �   CREATE TABLE public.cuentas (
    id_cuenta integer NOT NULL,
    monto integer NOT NULL,
    descripcion character varying(70) NOT NULL
);
    DROP TABLE public.cuentas;
       public         heap    postgres    false            �            1259    32885    cuentas_id_cuenta_seq    SEQUENCE     �   CREATE SEQUENCE public.cuentas_id_cuenta_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.cuentas_id_cuenta_seq;
       public          postgres    false    203            0           0    0    cuentas_id_cuenta_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.cuentas_id_cuenta_seq OWNED BY public.cuentas.id_cuenta;
          public          postgres    false    204            �            1259    32887 	   inmuebles    TABLE     �   CREATE TABLE public.inmuebles (
    tipo character varying(30) NOT NULL,
    estado character varying(30) NOT NULL,
    id_usuario integer,
    id_cuenta integer,
    id_inmueble character varying NOT NULL
);
    DROP TABLE public.inmuebles;
       public         heap    postgres    false            �            1259    32890 	   invitados    TABLE     �   CREATE TABLE public.invitados (
    id_invitado integer NOT NULL,
    nombre character varying(30) NOT NULL,
    apellido character varying(30) NOT NULL
);
    DROP TABLE public.invitados;
       public         heap    postgres    false            �            1259    32893    usuarios    TABLE       CREATE TABLE public.usuarios (
    id_usuario integer NOT NULL,
    nombre character varying(30) NOT NULL,
    apellido character varying(30) NOT NULL,
    telefono character varying(30) NOT NULL,
    email character varying(50) NOT NULL,
    nivel integer
);
    DROP TABLE public.usuarios;
       public         heap    postgres    false            �            1259    32896    usuarios_id_usuario_seq    SEQUENCE     �   CREATE SEQUENCE public.usuarios_id_usuario_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.usuarios_id_usuario_seq;
       public          postgres    false    207            1           0    0    usuarios_id_usuario_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.usuarios_id_usuario_seq OWNED BY public.usuarios.id_usuario;
          public          postgres    false    208            �            1259    32943    visitas    TABLE     �   CREATE TABLE public.visitas (
    id_visita integer NOT NULL,
    id_invitado integer,
    hora character varying,
    id_inmueble character varying NOT NULL
);
    DROP TABLE public.visitas;
       public         heap    postgres    false            �
           2604    32898    cuentas id_cuenta    DEFAULT     v   ALTER TABLE ONLY public.cuentas ALTER COLUMN id_cuenta SET DEFAULT nextval('public.cuentas_id_cuenta_seq'::regclass);
 @   ALTER TABLE public.cuentas ALTER COLUMN id_cuenta DROP DEFAULT;
       public          postgres    false    204    203            �
           2604    32899    usuarios id_usuario    DEFAULT     z   ALTER TABLE ONLY public.usuarios ALTER COLUMN id_usuario SET DEFAULT nextval('public.usuarios_id_usuario_seq'::regclass);
 B   ALTER TABLE public.usuarios ALTER COLUMN id_usuario DROP DEFAULT;
       public          postgres    false    208    207            "          0    32882    cuentas 
   TABLE DATA           @   COPY public.cuentas (id_cuenta, monto, descripcion) FROM stdin;
    public          postgres    false    203   V%       $          0    32887 	   inmuebles 
   TABLE DATA           U   COPY public.inmuebles (tipo, estado, id_usuario, id_cuenta, id_inmueble) FROM stdin;
    public          postgres    false    205   �%       %          0    32890 	   invitados 
   TABLE DATA           B   COPY public.invitados (id_invitado, nombre, apellido) FROM stdin;
    public          postgres    false    206   &       &          0    32893    usuarios 
   TABLE DATA           X   COPY public.usuarios (id_usuario, nombre, apellido, telefono, email, nivel) FROM stdin;
    public          postgres    false    207   ~&       (          0    32943    visitas 
   TABLE DATA           L   COPY public.visitas (id_visita, id_invitado, hora, id_inmueble) FROM stdin;
    public          postgres    false    209   '       2           0    0    cuentas_id_cuenta_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.cuentas_id_cuenta_seq', 3, true);
          public          postgres    false    204            3           0    0    usuarios_id_usuario_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.usuarios_id_usuario_seq', 1, false);
          public          postgres    false    208            �
           2606    32901    cuentas cuentas_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.cuentas
    ADD CONSTRAINT cuentas_pkey PRIMARY KEY (id_cuenta);
 >   ALTER TABLE ONLY public.cuentas DROP CONSTRAINT cuentas_pkey;
       public            postgres    false    203            �
           2606    32985    inmuebles inmuebles_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.inmuebles
    ADD CONSTRAINT inmuebles_pkey PRIMARY KEY (id_inmueble);
 B   ALTER TABLE ONLY public.inmuebles DROP CONSTRAINT inmuebles_pkey;
       public            postgres    false    205            �
           2606    32905    invitados invitados_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.invitados
    ADD CONSTRAINT invitados_pkey PRIMARY KEY (id_invitado);
 B   ALTER TABLE ONLY public.invitados DROP CONSTRAINT invitados_pkey;
       public            postgres    false    206            �
           2606    32907    usuarios usuarios_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (id_usuario);
 @   ALTER TABLE ONLY public.usuarios DROP CONSTRAINT usuarios_pkey;
       public            postgres    false    207            �
           2606    32987    visitas visitas_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.visitas
    ADD CONSTRAINT visitas_pkey PRIMARY KEY (id_visita);
 >   ALTER TABLE ONLY public.visitas DROP CONSTRAINT visitas_pkey;
       public            postgres    false    209            �
           2606    32969 "   inmuebles inmuebles_id_cuenta_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.inmuebles
    ADD CONSTRAINT inmuebles_id_cuenta_fkey FOREIGN KEY (id_cuenta) REFERENCES public.cuentas(id_cuenta);
 L   ALTER TABLE ONLY public.inmuebles DROP CONSTRAINT inmuebles_id_cuenta_fkey;
       public          postgres    false    2711    205    203            �
           2606    32976 #   inmuebles inmuebles_id_usuario_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.inmuebles
    ADD CONSTRAINT inmuebles_id_usuario_fkey FOREIGN KEY (id_usuario) REFERENCES public.usuarios(id_usuario);
 M   ALTER TABLE ONLY public.inmuebles DROP CONSTRAINT inmuebles_id_usuario_fkey;
       public          postgres    false    207    2717    205            �
           2606    32988     visitas visitas_id_inmueble_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.visitas
    ADD CONSTRAINT visitas_id_inmueble_fkey FOREIGN KEY (id_inmueble) REFERENCES public.inmuebles(id_inmueble);
 J   ALTER TABLE ONLY public.visitas DROP CONSTRAINT visitas_id_inmueble_fkey;
       public          postgres    false    2713    205    209            �
           2606    32953     visitas visitas_id_invitado_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.visitas
    ADD CONSTRAINT visitas_id_invitado_fkey FOREIGN KEY (id_invitado) REFERENCES public.invitados(id_invitado);
 J   ALTER TABLE ONLY public.visitas DROP CONSTRAINT visitas_id_invitado_fkey;
       public          postgres    false    206    209    2715            "   S   x��A� ���+x�����b��0��~�ִ�� "x�n�KU�ᝳ6��V�\L��y��\vH�t~A��'.xm��`�      $   S   x��1�  �����UX�.H���śO�<M�Z���">Ӫ�5j!`�x`btR|�%�x^��fK��g�a���ݸ.      %   R   x�3402�073����M,����t/M�)I-�/�2400637200�tN����Q	S�cN����D�����*�=... Ń�      &   �   x�U�A
�0EדÔ�I�Lvł�����$�����U����#DmIP�SN�	v�VS��;fq��2/��֙,�a^%��ť )Bg�G���s
������퍇�g�oN2�:7�:�bz�M���6��m�8�<�uY:���6�      (      x������ � �     